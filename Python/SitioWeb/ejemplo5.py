from flask import Flask, redirect, url_for, render_template, request, session
from datetime import time, timedelta

app = Flask(__name__)
app.secret_key = "hola"
app.permanent_session_lifetime = timedelta(days=5)

@app.route("/") #indica que será la página de inicio
def inicio():
    return render_template("nueva.html")

@app.route("/login", methods = ["POST", "GET"])
def login():
    if request.method == "POST":#obligatoriamente en mayuscula
        session.permanent = True
        nick = request.form["nombre"]
        session["user"] = nick
        return redirect(url_for("usuario"))
    else:
        return render_template("get_post.html")

@app.route("/usuario")
def usuario():
    if "user" in session:
        nombre = session["user"]
        return f"Usuario: <strong>{nombre}</strong>, Bienvenido!!!"
    else:
        return redirect(url_for("login"))

@app.route("/logout")
def logout():
    session.pop("user", None)
    return redirect(url_for("login"))

if __name__ == "__main__" :
    app.run(debug=True)
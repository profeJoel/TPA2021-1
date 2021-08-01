from flask import Flask, redirect, url_for, render_template, request

app = Flask(__name__)

@app.route("/") #indica que será la página de inicio
def inicio():
    return render_template("nueva.html")

@app.route("/login", methods = ["POST", "GET"])
def login():
    if request.method == "POST":#obligatoriamente en mayuscula
        nick = request.form["nombre"]
        return redirect(url_for("usuario", nombre=nick))
    else:
        return render_template("get_post.html")

@app.route("/<nombre>")
def usuario(nombre):
    return f"Usuario: <strong>{nombre}</strong>, Bienvenido!!!"

if __name__ == "__main__" :
    app.run(debug=True)
from flask import Flask, redirect, url_for, render_template

app = Flask(__name__)

@app.route("/") #indica que será la página de inicio
def inicio():
    return render_template("pagina.html", contenido = "Test")

@app.route("/otro") #indica que será la página de inicio
def otro():
    return render_template("nueva.html")

if __name__ == "__main__" :
    app.run(debug=True)
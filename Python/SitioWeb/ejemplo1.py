from flask import Flask, redirect, url_for

app = Flask(__name__)

@app.route("/") #indica que será la página de inicio
def inicio():
    return "<html> <head><script type='text/javascript'>alert('Hola tengo un alert en flask')</script></head> <body>Hola Mundo!!! <h1> Estoy en Flask </h1></body></html>"

@app.route("/<nombre>")
def usuario(nombre):
    return f"Hola: {nombre}!!!"

@app.route("/admin")
def admin():
    return redirect(url_for("inicio"))

if __name__ == "__main__" :
    app.run()
from flask import Flask, redirect, url_for, render_template

app = Flask(__name__)

@app.route("/") #indica que será la página de inicio
def inicio():
    #return render_template("tema.html", contenido = nombre, otro="otro nombre")
    return render_template("tema.html", contenido = ["Deim", "GoodYona", "Impostor", "Semurder"])

if __name__ == "__main__" :
    app.run()
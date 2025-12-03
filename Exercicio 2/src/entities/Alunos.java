package entities;

public class Alunos {
    public double a,b,c;
    public double media;

    public double CalculaMedia(){
        return media = a + b + c;
    }

    public String InformaMedia(){ //como usar a public string com if pesquisar

        if (CalculaMedia() < 60.0){
            media = 60.0 - media;
            return "Reprovado \nfaltaram " + media;
        }
        else {
            return "Aprovado";
        }
    }

    public String toString(){
        return "\nNota do aluno: " + CalculaMedia() + "\nSituacao: " + InformaMedia();
    }
}

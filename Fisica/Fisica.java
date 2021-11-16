import  java.lang.Math;

public class Fisica {
    


    //Atributos

    public float forcaPeso(float peso, float massa){
        return peso * massa;
 }

    public float velocidadeMedia(float distanciaFinal, float distanciaInicial, Short tempoFinal, Short tempoInicial){

        return (distanciaFinal - distanciaInicial ) / (tempoFinal - tempoInicial);

    }
    public float impulso(float forca, Short tempoFinal, Short tempoInicial){
        return forca * (tempoFinal - tempoInicial);

    }
    public float mru(float velocidade, float aceleracao, float tempo){
        return velocidade * tempo + aceleracao * tempo * tempo / 2;
    } 

    public  float forcacentripeta(float massa, float velocidade, float raio){
        return massa * (velocidade * velocidade )/ raio;

    }
    public float mru(float posicaoInicial, float velocidade, float intervaloTempo, float aceleracao){
        return posicaoInicial + velocidade *(intervaloTempo + aceleracao  *(intervaloTempo * intervaloTempo) / 2);

        
    }
    public float forcaElastica(float constanteElasticaMola , float deformacaoMola){

        return constanteElasticaMola * deformacaoMola;
    }





}

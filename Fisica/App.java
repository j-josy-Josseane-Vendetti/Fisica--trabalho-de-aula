public class App {
    public static void main(String[] args) {
        Fisica fisica = new Fisica();

        //Forca peso
        float peso = 60;
        float massa = 10f;
        float resultado = fisica.forcaPeso(peso, massa);

        //velocidade media
        //float distanciaFinal = 300;
        //float distanciaInicial = 0f;
       // float tempoFinal = 12;
       // float tempoInicial = 7;
       //  float resultado = fisica.velocidadeMedia(distanciaFinal, distanciaInicial,tempoFinal,tempoInicial);
    
        //Impulso
       // float forca = 20f;
        // tempoFinal = 8;
        // tempoInicial = 4;

       // float resultado = fisica.mruv(posicaoInicial, velocidade, intervaloTempo, aceleracao );
        
            //MU

           // distanciaFinal = 2;
            //distanciaInicial = 0;
            //velocidade = 340;
           // double tempo = 2.5;
            //resultado = fisica.mu(distanciaFinal, distanciaInicial, tempo);

            //forca elastica

           // float deformacaoMola = 40;
            //float constanteElasticaMola = 30;

           // resultado = fisica.forcaElastica(constanteElasticaMola, deformacaoMola);

           System.out.println(resultado);

    }
}







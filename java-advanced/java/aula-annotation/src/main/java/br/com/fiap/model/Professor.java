package br.com.fiap.model;

public class Professor extends Pessoa {

    @Override //garantir que o metodo esta sobrescrevendo
    @SuppressWarnings("all") //Retira os alertas (amarelinho)
    public void andar() {
        System.out.println("Professor andando");
    }

    @Override
    public void setAltura(float altura) {
        super.setAltura(altura);
    }

    @Deprecated //define que o metodo esta obsoleto e nao deve ser utilizado
    public void tranquilo(){
        int x = 123;
        System.out.println(x);
    }
}

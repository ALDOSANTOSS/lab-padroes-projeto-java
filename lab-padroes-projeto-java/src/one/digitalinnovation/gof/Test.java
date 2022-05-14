package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args){

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.print(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.print(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.print(eager);
        eager = SingletonEager.getInstancia();
        System.out.print(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.print(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.print(lazyHolder);


        // Strategy


        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // facade

        Facade facade = new Facade();
        facade.migraCliente("Aldo", "0430242432");




    }
}

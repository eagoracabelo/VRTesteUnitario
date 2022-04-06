/*
 * VR Software
 */
package br.com.vrsoft.vrtesteunitario.testes;

import br.com.vrsoft.vrtesteunitario.service.SleeperService;
import org.openide.util.Exceptions;
import vrframework.classe.VRInstance;

/**
 *
 * @author felipe.bruno
 */
public class ClasseA {

    private final SleeperService oSleeperService;

    public ClasseA() {
        this.oSleeperService = VRInstance.criar(SleeperService.class);
    }

    public ClasseA(SleeperService pSleeperService) {
        this.oSleeperService = pSleeperService;
    }

    public void calcular(Double pX, Double pY) {

        Double resultado = realizaMultiplicacao(pX, pY);
        exibeResultado(resultado);
    }

    public Double realizaMultiplicacao(Double pX, Double pY) {

        try {
            Double resultado = Math.abs(pX * pY);
            oSleeperService.sleep(5000);

            return resultado;
        } catch (InterruptedException e) {
            Exceptions.printStackTrace(e);
        }

        return 0D;
    }

    private void exibeResultado(Double pResultado) {

        String resultado = String.format("%s", pResultado);

        System.out.println("Resultado: " + resultado);

    }

}

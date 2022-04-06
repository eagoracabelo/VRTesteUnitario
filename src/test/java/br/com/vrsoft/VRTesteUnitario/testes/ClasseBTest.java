/*
 * VR Software
 */
package br.com.vrsoft.VRTesteUnitario.testes;

import br.com.vrsoft.vrtesteunitario.service.SleeperService;
import br.com.vrsoft.vrtesteunitario.testes.ClasseB;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import org.mockito.internal.util.MockUtil;

/**
 *
 * @author felipe.bruno
 */
public class ClasseBTest {

    private SleeperService oSleeperService;

    private ClasseB oClasseB;

    @BeforeAll
    public static void setUpClass() {
        Mockito.clearAllCaches();
        MockUtil.clearAllCaches();
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

        oSleeperService = mock(SleeperService.class);

        oClasseB = new ClasseB(oSleeperService);
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void teste_calcular() {

        oClasseB.calcular(1.0, 2.0);
    }

}

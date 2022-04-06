/*
 * VR Software
 */
package br.com.vrsoft.VRTesteUnitario.testes;

import br.com.vrsoft.vrtesteunitario.service.SleeperService;
import br.com.vrsoft.vrtesteunitario.testes.ClasseA;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyDouble;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.withSettings;
import org.mockito.internal.util.MockUtil;

/**
 *
 * @author felipe.bruno
 */
public class ClasseATest {

    private SleeperService oSleeperService;

    private ClasseA oClasseA;

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

        oClasseA = mock(ClasseA.class, withSettings().useConstructor(oSleeperService));
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void teste_calcular() {

        Mockito.doAnswer(c -> {
            c.callRealMethod();
            return null;
        }).when(oClasseA).calcular(anyDouble(), anyDouble());

        when(oClasseA.realizaMultiplicacao(anyDouble(), anyDouble())).thenReturn(5.0);

        oClasseA.calcular(1.0, 2.0);
    }

}

package TestCalculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import mainRestaMultiplicación.ActividadRestaMultiplicacion;

class RestaMultiplicacionTest {

	
		
		   Double valor1;
		   Double valor2;

		@Test
		
		public void restaTest() {
			
			valor1 = 38.0;
			valor2 = 9.0;
			
			Double resultado;
			
			resultado = ActividadRestaMultiplicacion.resta(valor1, valor2);
			Assert.assertNotNull("El resultado no puede ser nulo", resultado);
	        Assert.assertTrue("El resultado no es el esperado", resultado.equals(29.0) );
	    }
		
        @Test
		
		public void MultiplicacionTest() {
			
			valor1 = 7.0;
			valor2 = 4.0;
			
			Double resultado;
			
			resultado = ActividadRestaMultiplicacion.multiplicacion(valor1, valor2);
			Assert.assertNotNull("El resultado no puede ser nulo", resultado);
	        Assert.assertTrue("El resultado no es el esperado", resultado.equals(28.0) );
	    }

}


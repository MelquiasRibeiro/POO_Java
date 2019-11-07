package projetoPP2;

import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface ColunaAnnotation {
	String nome();
	int posicao();
}

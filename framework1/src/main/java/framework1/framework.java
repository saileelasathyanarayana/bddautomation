package framework1;

import com.fasterxml.jackson.databind.Module.SetupContext;

import io.github.bonigarcia.wdm.WebDriverManager;

public class framework {

	public static void main(String[] args) {
      WebDriverManager.chromedriver().setup();
	}

}

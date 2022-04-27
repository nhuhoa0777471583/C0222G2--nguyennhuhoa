package ss21_design_patterns.thuc_hanh.FactoryMethod;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Dog extends Animal{
    @Override
    public String makeSound() {
       return "gâu gâu";
    }
}

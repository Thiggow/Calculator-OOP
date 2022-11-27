import javax.script.*;

public class Expression {
    
    private String value;

    public void setValue(String value){

        this.value = value;
    }

    public String getValue(){

        return this.value;
    }

    public Object formatValue(String value) throws Exception{

        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");

        return engine.eval(value);
    }
}

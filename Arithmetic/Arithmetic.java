package Arithmetic;

public class Arithmetic<Type1, Type2> {
    private Type1 type1;
    private Type2 type2;

    public Arithmetic(Type1 type1, Type2 type2){
        if (!(type1 instanceof Number && type2 instanceof Number)) {
            throw new IllegalArgumentException("Argument is not of number type");
        }
        this.type1 = type1;
        this.type2 = type2;

    }

    public <T> T add() {
        double result = ((Number) type1).doubleValue() + ((Number) type2).doubleValue();
        return converter(result);
    }

   
    public <T> T subtract() {
        double result = ((Number) type1).doubleValue() - ((Number) type2).doubleValue();
        return converter(result);
    }

  
    public <T> T multiply() {
        double result = ((Number) type1).doubleValue() * ((Number) type2).doubleValue();
        return converter(result);
    }


    public <T> T divide() {
        if (((Number) type2).doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        }
        double result = ((Number) type1).doubleValue() / ((Number) type2).doubleValue();
        return converter(result);
    }

    public <T> T getMin() {
        double min = Math.min(((Number) type1).doubleValue(), ((Number) type2).doubleValue());
        return converter(min);
    }


    public <T> T getMax() {
        double max = Math.max(((Number) type1).doubleValue(), ((Number) type2).doubleValue());
        return converter(max);
    }
    
    @SuppressWarnings("unchecked")
    private <T> T converter(double value) {
        if (type1 instanceof Double || type2 instanceof Double) {
            return (T) Double.valueOf(value);
        }else if (type1 instanceof Float || type2 instanceof Float) {
            return (T) Float.valueOf((float) value);
        }else if (type1 instanceof  Long || type2 instanceof Long) {
            return (T) Long.valueOf((long) value);
        }else if (type1 instanceof Integer || type2 instanceof Integer) {
            return (T) Integer.valueOf((int) value);
        }else if (type1  instanceof Short || type2 instanceof Short) {
            return (T) Short.valueOf((short) value);
        }
        return null;
    }

    // private boolean check(Type1 type1, Type2 type2) {
    //     return type1 instanceof Number && type2 instanceof Number;
    // }

}


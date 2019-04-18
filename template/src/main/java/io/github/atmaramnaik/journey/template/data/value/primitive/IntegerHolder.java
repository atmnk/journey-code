package io.github.atmaramnaik.journey.template.data.value.primitive;


import io.github.atmaramnaik.journey.template.data.value.DeSerializationException;
import io.github.atmaramnaik.journey.template.data.value.ValueHolder;

public class IntegerHolder extends ValueHolder<Integer> {
    @Override
    public void deSerialize(String from) throws DeSerializationException {
        try {
            this.value=Integer.parseInt(from);
        } catch (NumberFormatException ex){
            throw new DeSerializationException("Value given is not valid Integer");
        }
    }

    @Override
    public String serialize() {
        return this.value.toString();
    }

    @Override
    public String jsonSerialize() {
        return serialize();
    }
}

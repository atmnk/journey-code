package io.github.atmaramnaik.journey.template.template.json.fillable;

import io.github.atmaramnaik.journey.template.data.runtime.Context;
import io.github.atmaramnaik.journey.template.data.value.Json;
import io.github.atmaramnaik.journey.template.data.variable.HashMapVariable;
import io.github.atmaramnaik.journey.template.template.Template;
import io.github.atmaramnaik.journey.template.template.expression.Expression;

public class ExpressionJsonTemplate implements Template<Json> {
    Expression expression;

    private ExpressionJsonTemplate() {
    }

    public ExpressionJsonTemplate(Expression expression) {
        this.expression = expression;
    }

    @Override
    public Json fillReturnValue(Context context) {
        return expression.fill(context);
    }

    @Override
    public HashMapVariable getRequiredDataVariables(Context context) {
        return expression.getRequiredDataVariables(context);
    }
}

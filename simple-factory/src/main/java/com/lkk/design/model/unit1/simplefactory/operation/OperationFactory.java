package com.lkk.design.model.unit1.simplefactory.operation;

/**
 * 运算对象工厂模式
 *
 * @author Quid Lee
 * @date 2019/5/27 16:03
 */
public class OperationFactory {

    /**
     * 根据运算符创建对应的运算对象
     * @param operate
     * @return
     */
    public static BaseOperation createOperate(String operate) {
        BaseOperation operation = null;
        switch (operate) {
            case "+" :
                operation = new OperationAdd();
                break;
            case "-" :
                operation = new OperationSub();
                break;
            case "*" :
                operation = new OperationMul();
                break;
            case "/" :
                operation = new OperationDiv();
                break;

            default:
                throw new RuntimeException("暂未支持" + operate + "运算符的运算操作!");
        }
        return operation;
    }
}

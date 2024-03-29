package DesignPattern.Behavior.Obeserver;

import Util.MyUtils;

/**
 * A notification component inherited from observer,
 * applying the observer pattern
 */
public class Notification implements Observer {

    /** DesignPattern.Behavior.State of the observer */
    private String observerState;

    /**
     * Update the state of the observer, so as to make it consistent
     * with the target state
     *
     * @param name the plant calling the method
     * @param newState the new state of the target observable object
     */
    @Override
    public void update(String name, String newState) {
        observerState = newState;
        MyUtils.getModifierString(this,null,"update");
        System.out.println(name + "改变状态为" + observerState);
    }

}

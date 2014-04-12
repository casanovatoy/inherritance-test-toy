/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package th.co.geniustree.training.inherritance.test;

/**
 *
 * @author TOY
 */
public class Brid extends Animal{

    public Brid() {
        //System.out.println("Bird");
        this.setName("Brid");
    }
    @Override
    public void eat(){
        System.out.println("Brid Eat");
    }
}

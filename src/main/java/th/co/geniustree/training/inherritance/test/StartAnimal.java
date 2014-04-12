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
public class StartAnimal {
    public static void main(String[] args) {
       runAnimal();
    }
    static void runAnimal(){
        Brid brid = new Brid();
        System.out.println(brid.getName());
        brid.eat();
        Fish fish = new Fish();
        System.out.println(fish.getName());
        fish.eat();
        Chicken chicken = new Chicken();
        System.out.println(chicken.getName());
        chicken.eat();
    }
}

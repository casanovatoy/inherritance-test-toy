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
public class Fish extends Animal implements Aquatic{
    public Fish() {
        //System.out.println("Fish");
        this.setName("Fish");
    }
    @Override
    public void eat(){
        System.out.println("Fish Eat");
    }
    
    @Override
    public void swim(){
        
    }
}

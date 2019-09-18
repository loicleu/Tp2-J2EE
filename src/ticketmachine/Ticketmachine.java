/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticketmachine;

/**
 *
 * @author lleu
 */
public class Ticketmachine {
    int balance;
    int prix;
    int total;
    
    public Ticketmachine(int ticketCost) {
        if (ticketCost>=0){
    balance=0;
    total=0;
    prix=ticketCost;
    }}
    
    public int getPrice() {
        if (prix>=0){
            return prix;}
    return 0;}
    
    public int getTotal() {
    return total;}
    
    public int getBalance() {
    return balance;}
    
    public void insertMoney(int amount) {
        if (amount>=0){
            balance+=amount;}}
    
    public int refund() {
    int rendre=balance;
    balance=0;
    return rendre;}
    
    public boolean printTicket(){
        if (balance>=prix){
              total+=prix;
              balance-=prix;
              return true;}
        else{return false;}
        
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

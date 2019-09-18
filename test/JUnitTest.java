/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import ticketmachine.Ticketmachine;

/**
 *
 * @author lleu
 */

    
    public class JUnitTest {
	private static final int prix = 25; 

	private Ticketmachine machine;
        private Ticketmachine machine2;

	@Before
	public void setUp() {
		machine = new Ticketmachine(prix); 
	}

	@Test 
        //S1
	public void prixestcorrect() {
		assertEquals("prix incorrect", prix, machine.getPrice());
	}

	@Test
        //S2
	public void Balance() {
		machine.insertMoney(10);
		machine.insertMoney(20);
		assertEquals("La balance n'est pas correcte", 10 + 20, machine.getBalance());
	}
        
        @Test
        //S6
        public void Getgoodtotal(){
        machine.insertMoney(prix);
        assertEquals("le total n'est pas correct",0,machine.getTotal());
        machine.printTicket();
        assertEquals("le total n'est pas correct",prix,machine.getTotal());}
        
        @Test
        //S7 et S8
        public void Okreturn(){
            machine.insertMoney(63);
            assertEquals("la monnaie rendu n'est pas correcte",63,machine.refund());
            assertEquals("la balance est mal remise a zéro",0,machine.getBalance());
        }
        @Test
        //S3
        public void Impressionincorrecte(){
            machine.insertMoney(23);
            assertEquals("Le ticket n'est pas bien imprimé",false,machine.printTicket());
            }
        
        @Test
        //S4
        public void Impressioncorrecte(){
            machine.insertMoney(prix);
            assertEquals("Le ticket n'est pas bien imprimé",true,machine.printTicket());
            }
        
        @Test
        //S9
        public void Montantpositif(){
            machine.insertMoney(-5);
            assertEquals("Le prix est negatif",0,machine.getBalance());
        }
        @Test
        //10
        public void Prixtickets(){
            machine2 = new Ticketmachine(-5);
            assertEquals("Le prix du ticket est negatif",0,machine2.getPrice());
        }
        }



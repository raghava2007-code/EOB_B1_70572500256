class bank{
 String name;
 int acno, balance;

 void deposit(double amt)
{
 balance+=amt;
System.out.println(amt+" Credited");
}
 void withdraw(double amt)
{
 if(amt>=0 && amt<=balance)
  {
    balance-=amt;
    System.out.println(amt+" Deducted");
  }
 else
    System.out.println("Insufficient Balance");
}
 void display()
{
 System.out.println(name+"'s Balance: "+balance);
}
 public static void main(String[] args)
{
  bank acc = new bank();
  acc.name="Raghavendra";
  acc.acno=123456;
  acc.balance=1000;
  acc.display();
  acc.deposit(2000);
  acc.withdraw(1000);
  acc.deposit(500);
  acc.display();
}
}
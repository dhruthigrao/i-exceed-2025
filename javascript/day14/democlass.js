class BankAccount {
    constructor(balance) {
        this.balance = balance;
    }

    deposit(amt) {
        this.balance += amt;
    }

    withdraw(amt) {
        this.balance -= amt;
    }

    getBalance() {
        return this.balance;
    }
}

let user1=new BankAccount(1000);
user1.deposit(2300);
let user2=new BankAccount(2000);
user2.withdraw(1000);

console.log(user1.getBalance());
console.log(user2.getBalance());

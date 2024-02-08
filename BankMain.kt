package eu.tutorials.bankaccountprogram

fun main() {
    val denisesBankAccount = BankAccount("Denis Panjuta", 13438.23)

    //println(denisesBankAccount.accountHolder)
    denisesBankAccount.deposit(200.0)
    denisesBankAccount.withdraw(3000.0)
    denisesBankAccount.deposit(3000.0)
    denisesBankAccount.deposit(2000.0)
    denisesBankAccount.displayTransactionHistory()
}

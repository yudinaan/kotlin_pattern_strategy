class QIWIStrategy(private val email: String, private val password: String) : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Payment of $$amount with QIWI email $email")
    }
}
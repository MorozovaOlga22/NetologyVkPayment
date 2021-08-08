/**
 * Программа для расчета комиссии с денежного перевода.
 * Все деньги указаны в копейках
 */
fun main() {
    val commissionMultiplier = 0.0075
    val minCommissionAmount = 3_500

    val amount = 1_000_000
    val commissionFromAmount = (amount * commissionMultiplier).toInt()
    val resultCommission =
        if (commissionFromAmount >= minCommissionAmount) commissionFromAmount else minCommissionAmount
    println("Комиссия по переводу (в копейках): $resultCommission")
}
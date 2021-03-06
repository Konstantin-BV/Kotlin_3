package labtr

sealed class DeliveryMethod
{
    object SelfPickup: DeliveryMethod()
    data class CourierDelivery(val adress: String,val cost: Double) : DeliveryMethod()
}
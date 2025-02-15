package day17.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MaskStoreDto(
    val count: Int? = null,
    val stores: List<Pharmacy>? = null,
)

@Serializable
data class Pharmacy(
    val addr: String? = null,
    val code: String? = null,
    @SerialName("created_at")
    val createdAt: String? = null,
    val lat: Double? = null,
    val lng: Double? = null,
    val name: String? = null,
    @SerialName("remain_stat")
    val remainStat: String? = null,
    @SerialName("stock_at")
    val stockAt: String? = null,
    val type: String? = null,
)


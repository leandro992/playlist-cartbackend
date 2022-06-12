package com.playlist.aluraflix.domain

import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity(name = "video")
data class Video(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
    @Column
    val title: String,
    @Column
    val description: String,
    @Column
    val url: String
){
    @Column
    val updatedAt: LocalDateTime = LocalDateTime.now()
}
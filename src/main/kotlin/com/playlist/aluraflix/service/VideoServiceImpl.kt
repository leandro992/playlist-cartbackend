package com.playlist.aluraflix.service

import com.playlist.aluraflix.domain.Video
import com.playlist.aluraflix.repository.VideoRepository
import javax.inject.Singleton


@Singleton
open class VideoServiceImpl(private val videoRepository: VideoRepository) : VideoService {

    override fun save(video: Video): Video =
        videoRepository.save(video)

    override fun replace(video: Video): Video {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    override fun allVideo(): List<Video> = videoRepository.findAll()

    override fun getById(id: Long): Video {
        TODO("Not yet implemented")
    }

}
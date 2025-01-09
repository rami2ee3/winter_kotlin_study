package day17.repository

import day17.dataSource.PhotoDataSource
import day17.mapper.PhotoMapper
import day17.model.Photo

class PhotoRepositoryImpl(private val photoDataSource: PhotoDataSource): PhotoRepository {
    override suspend fun responsePhotoData(): List<Photo> {
        val photoDtoList = photoDataSource.getPhotoData()
        return photoDtoList.map { PhotoMapper(it)}
    }
}
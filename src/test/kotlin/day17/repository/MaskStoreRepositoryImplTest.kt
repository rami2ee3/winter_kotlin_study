package day17.repository

import day17.dataSource.MockMaskStoreDataSourceImpl
import day17.model.Pharmacy
import kotlinx.coroutines.test.runTest
import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MaskStoreRepositoryImplTest {
    private val mockDataSource = MockMaskStoreDataSourceImpl()
    private val repository = MaskStoreRepositoryImpl(mockDataSource)

    @Test
    fun checkGetValidStore() = runTest {
        val result: List<Pharmacy> = repository.getValidStore()
        assertEquals(2, result.size)

        result.forEach {
            assertTrue { it.remainStat.isNotEmpty() }
            assertTrue { it.stockAt.isNotEmpty() }
            assertTrue { it.createdAt.isNotEmpty() }
        }
    }
}
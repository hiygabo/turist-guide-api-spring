@Service
class TourService (
    private val tourRepository: TourRepository
){
    fun getTours(): List<Tour>{
        return tourRepository.findAll()
    }
}
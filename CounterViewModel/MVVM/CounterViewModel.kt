package eu.tutorials.counterviewmodel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

//class CounterViewModel(private val repository: CounterRepository) : ViewModel() {
    /* or remove repository parameter and add this
    private val _repository: CounterRepository = CounterRepository()
     */
class CounterViewModel() : ViewModel() {
    private val repository: CounterRepository = CounterRepository() // _repository

    private val _count = mutableStateOf(repository.getCounter().count)
    // Expose the count as an immutable state
    val count: MutableState<Int> = _count

    fun increment() {
        repository.incrementCounter()
        _count.value = repository.getCounter().count
    }

    fun decrement() {
        repository.decrementCounter()
        _count.value = repository.getCounter().count
    }
}
/*class CounterViewModel() : ViewModel() {
    private val _count = mutableStateOf(0)

    // Expose the count as an immutable state
    val count: MutableState<Int> = _count

    fun increment() {
        _count.value++
    }

    fun decrement() {
        _count.value--
    }
}

 */

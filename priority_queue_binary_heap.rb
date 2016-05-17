class PriorityQueue
  attr :elements
  def initialize
    @elements = [nil]
  end

  def bubble_up(index)
    parent_index = (index / 2)
    # return if we reach the root element
    return if index <= 1
    # or if the parent is already greater than the child
    return if @elements[parent_index] >= @elements[index]
    # otherwise we exchange the child with the parent
    exchange(index, parent_index)
    # and keep bubbling up
    bubble_up(parent_index)
  end

  def exchange(source, target)
    @elements[source], @elements[target] = @elements[target], @elements[source]
  end

  def <<(element)
    @elements << element
    # bubble up the element that we just added
    bubble_up(@elements.size - 1)
  end
  
  def peek
    @elements[1]
  end
  
  def pop
    # exchange the root with the last element
    exchange(1, @elements.size - 1)

    # remove the last element of the list
    max = @elements.pop

    # and make sure the tree is ordered again
    bubble_down(1)
    max
  end

  def bubble_down(index)
    child_index = (index * 2)

    # stop if we reach the bottom of the tree
    return if child_index > @elements.size - 1

    # make sure we get the largest child
    not_the_last_element = child_index < @elements.size - 1
    left_element = @elements[child_index]
    right_element = @elements[child_index + 1]
    child_index += 1 if not_the_last_element && right_element > left_element

    # there is no need to continue if the parent element is already bigger
    # then its children
    return if @elements[index] >= @elements[child_index]

    exchange(index, child_index)

    # repeat the process until we reach a point where the parent
    # is larger than its children
    bubble_down(child_index)
  end
end

q = PriorityQueue.new
q << 2
q << 3
q << 1
q << 5
q << 9
q << 4
q << 11
p q.elements # => [nil, 3, 2, 1]

q.pop
p q.elements

p q.peek
p q.elements



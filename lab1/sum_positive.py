def sum_positive(numbers):
    total = 0

    for n in numbers:
        if n < 0:
            raise ValueError("Negative numbers are not allowed")
        total += n

    return total
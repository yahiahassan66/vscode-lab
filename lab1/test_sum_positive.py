import pytest
from sum_positive import sum_positive

def test_normal_list():
    assert sum_positive([1, 2, 3]) == 6

def test_contains_zero():
    assert sum_positive([0, 1, 2]) == 3

def test_empty_list():
    assert sum_positive([]) == 0

def test_large_numbers():
    assert sum_positive([100, 200, 300]) == 600

def test_negative_number():
    with pytest.raises(ValueError):
        sum_positive([1, -2, 3])
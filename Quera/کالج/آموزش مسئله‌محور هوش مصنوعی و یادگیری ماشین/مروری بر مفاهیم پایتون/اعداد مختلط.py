import math, re

class Complex:

    def __init__(self, real = 0, img = 0):
        self._real = float(real)
        self._img = float(img)
        self.magnitude = math.sqrt((self._real ** 2) + (self._img ** 2))

    def __str__(self):

        if self._img == 0:
            return '{:.2f}'.format(self._real)

        sign = '-' if (self._img // abs(self._img) < 0) else '+'
        return '{:.2f}'.format(self._real) + ' ' + sign + ' ' + '{:.2f}'.format(abs(self._img)) + 'i'

    def is_complex(self, complex):
        real = int(complex._real)
        img = int(complex._img)
        sign = '-' if (complex.img / abs(complex.img) < 0) else '+'
        
        return re.search(r'^-?(\d+)(\+|-)(\d+)i', str(real) + sign + str(abs(img)) + 'i') is not None        

    def __add__(self, other):
        if self.is_complex(other):
            return Complex(self._real + other._real, self._img + other._img)
        else:
            raise TypeError()

    def __sub__(self, other):
        if self.is_complex(other):
            return Complex(self._real - other._real, self._img - other._img)
        else:
            raise TypeError()

    def __mul__(self, other):
        if self.is_complex(other):
            A = self._real
            B = self._img
            C = other._real
            D = other._img

            return Complex(A * C - B * D, A * D + B * C)
        else:
            raise TypeError()
    
    @classmethod
    def from_string(cls, s):
        regex = re.search(r'^(-?)(\d+)(\+|-)(\d+)i', s.replace(' ', ''))
        real = int(regex[2])
        img = int(regex[4])

        real *= -1 if (regex[1] == '-') else 1
        img *= -1 if (regex[3] == '-') else 1

        return cls(real, img)

    @property
    def real(self):
        return self._real

    @property
    def img(self):
        return self._img

    @real.setter
    def real(self, real = 0):
        self._real = float(real)
    
    @img.setter
    def img(self, img = 0):
        self._img = float(img)
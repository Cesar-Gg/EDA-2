import matplotlib.pyplot as plt

# Datos de entrada
n = [50, 100, 500, 800, 1000, 2000, 5000]

s_comp = [1225, 4950, 124750, 319600, 499500, 1999000, 12497500]
s_time = [853500, 164400, 2126600, 572400, 753700, 4403300, 20606300]
s_op = [1225, 4950, 124750, 319600, 499500, 1999000, 12497500]

i_swap = [657, 2602, 60171, 156145, 256634, 1003847, 6242915]
i_time = [341800, 110800, 2360400, 1162100, 747500, 780500, 4441200]
i_op = [657, 2602, 60171, 156145, 256634, 1003847, 6242915]

m_comp = [211, 547, 3845, 6727, 8689, 19425, 55277]
m_time = [312800, 128400, 175500, 167200, 414300, 642100, 1649700]
m_op = [211, 547, 3845, 6727, 8689, 19425, 55277]

b_pass = [41, 92, 450, 762, 953, 1976, 4917]
b_time = [371200, 267500, 3757700, 1322300, 1111500, 3803900, 14869400]
b_op = [2050, 9200, 225000, 609600, 953000, 3952000, 12497500]

h_comp = [1955113142, -853016658, -1674051666, 616431502, 1514517726, -1231168290, 101868098]
h_time = [346200, 56600, 308500, 205800, 315600, 835600, 3410800]
h_op = [1955113142, -853016658, -1674051666, 616431502, 1514517726, -1231168290, 101868098]

# Gráfica de comparaciones
plt.plot(n, s_comp, label='Selección')
plt.plot(n, i_swap, label='Inserción')
plt.plot(n, m_comp, label='Mezcla')
plt.plot(n, b_pass, label='Burbuja')
plt.plot(n, h_comp, label='Montón')
plt.title('Comparaciones')
plt.xlabel('Tamaño del arreglo')
plt.ylabel('Número de comparaciones')
plt.legend()
plt.show()

# Gráfica de tiempos
plt.plot(n, s_time, label='Selección')
plt.plot(n, i_time, label='Inserción')
plt.plot(n, m_time, label='Mezcla')
plt.plot(n, b_time, label='Burbuja')
plt.plot(n, h_time, label='Montón')
plt.title('Tiempos')
plt.xlabel('Tamaño del arreglo')
plt.ylabel('Tiempo (ns)')
plt.legend()
plt.show()

#

import matplotlib.pyplot as plt

# Datos proporcionados
sizes = [100, 500, 800, 1000, 2000, 5000, 10000]

selection_comparisons = [1225, 124750, 319600, 499500, 1999000, 12497500, 49995000]
selection_times = [713200, 1726600, 1450200, 2589400, 2282900, 13347100, 47524300]
selection_operations = [1225, 124750, 319600, 499500, 1999000, 12497500, 49995000]

insertion_exchanges = [692, 61047, 161200, 251068, 1000149, 6280264, 24995000]
insertion_times = [365600, 3300500, 2119700, 814100, 1731600, 11660300, 41678200]
insertion_operations = [692, 61047, 161200, 251068, 1000149, 6280264, 24995000]

merge_comparisons = [223, 3849, 6753, 8723, 19419, 55288, 115189]
merge_times = [356300, 190500, 286000, 250500, 711100, 836200, 1822700]
merge_operations = [223, 3849, 6753, 8723, 19419, 55288, 115189]

bubble_passes = [47, 491, 757, 971, 1985, 4884, 9999]
bubble_times = [403000, 2819400, 897400, 2330500, 3853200, 22834600, 81623200]
bubble_operations = [2350, 245500, 605600, 971000, 3970000, 24420000, 49995000]

heap_comparisons = [536, 8568, 14818, 19098, 42290, 119195, 241902]
heap_times = [328700, 323900, 245400, 317800, 298900, 1089600, 2562100]
heap_operations = [536, 8568, 14818, 19098, 42290, 119195, 241902]

# Gráfica de comparaciones
plt.plot(sizes, selection_comparisons, label="Selection")
plt.plot(sizes, insertion_exchanges, label="Insertion")
plt.plot(sizes, merge_comparisons, label="Merge")
plt.plot(sizes, bubble_passes, label="Bubble")
plt.plot(sizes, heap_comparisons, label="Heap")

plt.title("Comparaciones por tamaño del arreglo")
plt.xlabel("Tamaño del arreglo")
plt.ylabel("Número de comparaciones")
plt.legend()
plt.show()

# Gráfica de operaciones totales
plt.plot(sizes, selection_operations, label="Selection")
plt.plot(sizes, insertion_operations, label="Insertion")
plt.plot(sizes, merge_operations, label="Merge")
plt.plot(sizes, bubble_operations, label="Bubble")
plt.plot(sizes, heap_operations, label="Heap")

plt.title("Operaciones totales por tamaño del arreglo")
plt

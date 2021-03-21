def process(path):
    
	athletes = []
	athletes_count = 0
	athletes_bmi_sum = 0
	normal_people = []
	normal_people_count = 0
	normal_people_bmi_sum = 0

	with open(path, 'r') as file:

		kind = 0

		for line in file:

			data = line.replace('\n', '').split(' ')

			height = int(data[0])
			weight = float(data[1])
			BMI = weight / (((height) / 100) ** 2)

			if data[-1] == 'ATHLETE':
				athletes.append((height, weight, BMI))
				athletes_bmi_sum += BMI
				athletes_count += 1
			else:
				normal_people.append((height, weight, BMI))
				normal_people_bmi_sum += BMI
				normal_people_count += 1

	athletes_average_bmi = athletes_bmi_sum / athletes_count
	normal_average_bmi = normal_people_bmi_sum / normal_people_count

	return athletes , athletes_average_bmi , normal_people, normal_average_bmi
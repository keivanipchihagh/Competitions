import re
def encode(text):
    
    # Format
    text = re.sub(' +', ' ', text.strip()).replace('\n', ' ')
    text = re.sub('[^A-Za-z0-9 ]+', '', text)
    keys_duplicated = [key.strip() for key in text.split(' ') if key.strip() != '']
	
    keys = []

    for key in keys_duplicated:
        if not key in keys:
            keys.append(key)

    word_to_number_map = {}
	
    for i in range(len(keys)):
        word_to_number_map[keys[i]] = i + 1	

    numbers = []
    for word in text.split(' '):
        if word != '':
            numbers.append(word_to_number_map[word])

    return word_to_number_map,numbers
import hashlib
import re

def is_email_valid(email):
	return False if (re.search(r'(^|\ )([a-zA-Z0-9\-\_]+)(@{1}[a-zA-Z0-9]+)(\.{1}[a-zA-Z]{0,3})(\ |$)', email) is None) else True

def hash_password(password):
	return hashlib.md5(password.encode()).hexdigest()

def process_data(data):
	data = filter(lambda pair: is_email_valid(pair[0]), data)
	data = list(map(lambda t: (t[0], hash_password(t[1])), data))
	return data
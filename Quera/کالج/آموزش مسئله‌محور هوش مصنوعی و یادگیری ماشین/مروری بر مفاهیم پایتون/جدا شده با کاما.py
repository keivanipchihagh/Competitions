class Table:
    def __init__(self, path = None):
        
        self.labels = []
        self.rows = []

        if path is None:
            return

        with open(path, 'r') as file:

            contents = []

            for line in file:
                contents.append(line.replace('\n', '').split(','))

            self.labels = contents[0]
            self.rows = contents[1:]

    def save(self, path):
        with open(path, 'w') as file:
            file.write(','.join(self.labels) + '\n')
            for row in self.rows:
                file.write(','.join(row) + '\n')

    def get_row_dict(self, row_index):
        return dict(zip(self.labels, self.rows[row_index]))

    def get_cell(self, row_index, label):
        return self.rows[row_index][self.labels.index(label)]

    def get_column(self, label):
        values = []

        for row in self.rows:
            values.append(row[self.labels.index(label)])

        return values

    def get_label_index(self, label):
        return self.labels.index(label)

    def to_dict(self):
        return {'labels': self.labels, 'rows': self.rows}
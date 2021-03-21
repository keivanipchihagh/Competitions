import matplotlib
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

matplotlib.use('Agg')


def show_hist(column, path=None):
    df_train = pd.read_csv('data/train.csv')

    dft = df_train[column]

    quarts = dft.quantile([0.25, 0.5, 0.75])

    bin_count = int(np.ceil((dft.max() - dft.min()) / (2 * (quarts[0.75] - quarts[0.25]) / (dft.count() ** (1 / 3)))))

    hist = plt.hist(dft, bins=bin_count, color="blue")

    if path:
        plt.savefig(path)

    return hist[0]

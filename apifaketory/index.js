const express = require('express');
const app = express();
const port = 4000;

const jsonData = {
	data: [
		{
			gender: 'female',
			name: {
				title: 'Ms.',
				first: 'Molly',
				last: 'Robel'
			},
			location: {
				street: '24674 Cyrus Key Apt. 291',
				city: 'Emilieberg',
				state: 'Texas',
				postcode: '47890-3822'
			},
			email: 'tremblay.loy@streich.com',
			login: {
				username: 'devonte67',
				password: "><'}$pwwuv",
				md5: 'a9b1643ad87da1cf6598a27c5bbd3ae1',
				sha1: '42f2cc46f189cb35c600d4a788a050d0ee27d623',
				sha256: '9f5a440f116de4b9e54ac378ba96b98f126cf0a3ec6c76d0e01cfefd8b75fcab'
			},
			phone: '866-864-1372',
			job: {
				title: 'Gas Processing Plant Operator',
				company: 'Keeling, Halvorson and Mayert'
			},
			billing: {
				card: {
					type: 'MasterCard',
					number: '4539661724756466',
					expiration_date: {
						date: '2016-09-29 01:39:53.000000',
						timezone_type: 3,
						timezone: 'UTC'
					},
					iban: 'NA55633746255612759286461167',
					swift: 'RGBHHSXZ'
				}
			},
			language: 'yi',
			currency: 'ZAR'
		},
		{
			gender: 'female',
			name: {
				title: 'Ms.',
				first: 'Molly',
				last: 'Robel'
			},
			location: {
				street: '24674 Cyrus Key Apt. 291',
				city: 'Emilieberg',
				state: 'Texas',
				postcode: '47890-3822'
			},
			email: 'tremblay.loy@streich.com',
			login: {
				username: 'devonte67',
				password: "><'}$pwwuv",
				md5: 'a9b1643ad87da1cf6598a27c5bbd3ae1',
				sha1: '42f2cc46f189cb35c600d4a788a050d0ee27d623',
				sha256: '9f5a440f116de4b9e54ac378ba96b98f126cf0a3ec6c76d0e01cfefd8b75fcab'
			},
			phone: '866-864-1372',
			job: {
				title: 'Gas Processing Plant Operator',
				company: 'Keeling, Halvorson and Mayert'
			},
			billing: {
				card: {
					type: 'MasterCard',
					number: '4539661724756466',
					expiration_date: {
						date: '2016-09-29 01:39:53.000000',
						timezone_type: 3,
						timezone: 'UTC'
					},
					iban: 'NA55633746255612759286461167',
					swift: 'RGBHHSXZ'
				}
			},
			language: 'yi',
			currency: 'ZAR'
		}
	]
};
app.get('/data', (req, res) => res.send(jsonData));

app.listen(port, () => console.log(`Exampleistening on port  app l${port}!`));

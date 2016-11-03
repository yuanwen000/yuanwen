def log(text):
	def decorate(func):
		def wra(*args,**kw):
			print '%s , %s() ;'%(text , func.__name__)
			func()
			print 'end call'
		return wra
	return decorate

@log( 'begin call')
def now():
	print '2222'


now()
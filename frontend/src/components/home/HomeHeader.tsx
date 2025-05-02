function HomeHeader() {
  return (
    <header className="flex bg-blue-500 text-white py-4 px-8 shadow-md h-12 items-center justify-between">
      <h1 className="text-2xl font-bold">Plug.dj</h1>
      <nav>
        <ul className="flex space-x-4 gap-4">
          <li>
            <a href="/" className="hover:underline">
              Home
            </a>
          </li>
          <li>
            <a href="/about" className="hover:underline">
              About
            </a>
          </li>
          <li>
            <a href="/contact" className="hover:underline">
              Contact
            </a>
          </li>
          <li>
            <a href="/login" className="hover:underline">
              Login
            </a>
          </li>
        </ul>
      </nav>
    </header>
  );
}

export default HomeHeader;

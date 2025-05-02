import { BrowserRouter as Router, Route, Routes, Navigate } from "react-router-dom";
import { Suspense, lazy } from "react";
import HomePage from "./pages/HomePage";
import RoomPage from "./pages/RoomPage";
import HomeRoomPage from "./pages/HomeRoomPage";

const LoginPage = lazy(() => import("./pages/LoginPage"));

function isAuthenticated() {
  return !!localStorage.getItem("authToken")
}

function AppRoutes() {
  return (
    <Router>
      <Suspense fallback={<div>Loading...</div>}>
        <Routes>
          <Route path="/login" element={isAuthenticated() ? <Navigate to="/home" /> : <LoginPage />} />
          <Route path="/" element={<HomePage />} />
          <Route path="/room" element={<RoomPage />} />
          <Route path="/home" element={<HomeRoomPage />} />
        </Routes>
      </Suspense>
    </Router>
  );
}

export default AppRoutes;
